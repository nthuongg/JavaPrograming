package com. WordProgram;

import java.io.File;
import java.io.FileInputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileManagement {
    public void getFile(File fileSource, String word) {
        File files[] = fileSource.listFiles();
        for (File item : files) {
            if (item.isDirectory()){
                getFile(item, word);
            } else {
                if (item.getName().endsWith("doc")) {
                    try {
                        int count = this.countWord(item, word);
                        if (count > 0){
                            System.out.println(item.getAbsolutePath() + "//" + item.getName());
                        } else {
                            System.out.println("Not found in " + item.getName());
                        }
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
    }

    public int countWord(File fileSource, String word) throws Exception {
        int count = 0;
        try {
            String content = this.readFile(fileSource);
            Pattern pattern = Pattern.compile(word);
            Matcher match = pattern.matcher(content);

            while (match.find()){
                count++;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return count;
    }
    private String readFile(File fileSource) throws Exception {
        try {
            FileInputStream fis = new FileInputStream(fileSource);
            int available = fis.available();
            byte content[] = new byte[available];
            fis.read(content);

            fis.close();
            return (new String(content));
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }




}
