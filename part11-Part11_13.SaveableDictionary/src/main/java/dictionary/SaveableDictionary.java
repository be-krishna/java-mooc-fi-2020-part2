/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author be-krishna
 */
public class SaveableDictionary {

    private HashMap<String, String> dictionary;

    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.file = file;
        this.dictionary = new HashMap<>();
    }

    public boolean load() {
        try ( Scanner scanner = new Scanner(Paths.get(this.file))) {
            while (scanner.hasNext()) {
                String row = scanner.nextLine();
                String[] parts = row.split(":");
                this.dictionary.put(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {

        }
        return false;
    }

    public void add(String word, String translation) {
        if (this.dictionary.containsKey(word)) {
            return;
        }
        this.dictionary.put(word, translation);
    }

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(this.file);
            this.dictionary.forEach((k, v) -> writer.println(k + ":" + v));
            writer.close();
            return true;
        } catch (FileNotFoundException ex) {
        }
        return false;
    }

    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        } else {
            for (String key : this.dictionary.keySet()) {
                if (this.dictionary.get(key).equals(word)) {
                    return key;
                }
            }
        }
        return null;
    }

    public void delete(String word) {
        Iterator<Map.Entry<String, String>> iterator = this.dictionary.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();

            if (word.equals(entry.getKey())) {
                iterator.remove();
            } else if (word.equals(entry.getValue())) {
                iterator.remove();
            }
        }

    }

}
