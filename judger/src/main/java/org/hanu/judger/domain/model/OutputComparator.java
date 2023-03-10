package org.hanu.judger.domain.model;

import lombok.Builder;

import java.util.Scanner;

public class OutputComparator {
    @Builder
    public static class CompareResult {
        public final boolean equal;
        public final int differentLine;
    }

    public static CompareResult compare(String expectedOutputString,
                                        String actualOutputString) {
        try {
            check(expectedOutputString, actualOutputString);
            return CompareResult.builder()
                    .equal(true)
                    .differentLine(-1)
                    .build();
        } catch (CheckError e) {
            return CompareResult.builder()
                    .equal(false)
                    .differentLine(e.line)
                    .build();
        }
    }

    private static void check(String expectedOutputString, String actualOutputString) {
        Scanner actualOutput = new Scanner(actualOutputString);
        Scanner correctOutput = new Scanner(expectedOutputString);
        int line = 1;
        while (correctOutput.hasNextLine()) {
            if (!actualOutput.hasNextLine()) {
                throw new CheckError(line);
            }
            String correctLine = correctOutput.nextLine();
            String actualLine = actualOutput.nextLine();
            if (!trim(correctLine).equals(trim(actualLine))) {
                throw new CheckError(line);
            }
            line++;
        }
        while (actualOutput.hasNextLine()) {
            String actualLine = actualOutput.nextLine();
            if (!containsOnlyChars(actualLine, '\n', ' ')) {
                throw new CheckError(line);
            }
            line++;
        }
    }

    private static String trim(String line) {
        StringBuilder lineBuilder = new StringBuilder();
        int i = line.length() - 1;
        while (i >= 0 && (line.charAt(i) == ' ' || line.charAt(i) == '\t')) {
            i--;
        }
        for (int j = 0; j < i; j++) {
            lineBuilder.append(line.charAt(j));
        }
        return lineBuilder.toString();
    }

    private static boolean containsOnlyChars(String actualLine, char... chars) {
        for (int i = 0; i < actualLine.length(); i++) {
            boolean found = false;
            for (char c : chars) {
                if (actualLine.charAt(i) == c) {
                    found = true;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }
    private static class CheckError extends Error {
        int line;

        public CheckError(int line) {
            this.line = line;
        }
    }
}
