package ru.sberbank.edu;

public class FileToFileStatistic implements Statistic{

    @Override
    public int getLineCount() {
        return 0;
    }

    @Override
    public int getSpaceCount() {
        return 0;
    }

    @Override
    public String getLongestLine() {
        return null;
    }

    @Override
    public void save(int lineCount, int spaceCount, String line) {

    }
}
