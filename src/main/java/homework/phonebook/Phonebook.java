package homework.phonebook;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private List<Record> records;

    public Phonebook() {
        records = new ArrayList<>();
    }

    public void add(Record record) {
        records.add(record);
    }

    public Record find(String name) {
        for (Record record : records) {
            if (record.getName().equals(name)) {
                System.out.println("Record: " + record);
                return record;
            }
        }
        return null;
    }

    public List<Record> findAll(String name) {
        List<Record> allRecords = new ArrayList<>();
        for (Record record : records) {
            if (record.getName().equals(name)) {
                allRecords.add(record);
                System.out.println("Record: " + record);
            }
        }
        return allRecords.isEmpty() ? null : allRecords;
    }
}
