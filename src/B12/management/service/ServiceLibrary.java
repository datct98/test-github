package B12.management.service;

import java.util.ArrayList;
import java.util.Scanner;

public interface ServiceLibrary<T> {
    void insert(Scanner scanner, ArrayList<T> list);
    void edit(int id, ArrayList<T> list);
    void delete(int id, ArrayList<T> list);
}
