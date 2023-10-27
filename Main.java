package Students3;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {

        Data flow256 = new Data();
        flow256.addLearningGroups(new StudentGroup(1, "Борис", "Пострыкайло"));
        flow256.addLearningGroups(new StudentGroup(3, "Сергей", "Маратов"));
        flow256.addLearningGroups(new StudentGroup(3, "Владимир", "Столыпин"));
        flow256.addLearningGroups(new StudentGroup(2, "Дмитрий", "Римский"));
        flow256.addLearningGroups(new StudentGroup(1, "Алексей", "Голдынский"));
        flow256.addLearningGroups(new StudentGroup(1, "Анна", "Пескова"));
        flow256.addLearningGroups(new StudentGroup(1, "Мария", "Пузырская"));
        flow256.addLearningGroups(new StudentGroup(3, "Анастасия", "Добронравова"));
        flow256.addLearningGroups(new StudentGroup(3, "Максим", "Перов"));
        flow256.addLearningGroups(new StudentGroup(2, "Федор", "Мошкин"));
        flow256.addLearningGroups(new StudentGroup(2, "Артем", "Федоров"));
        for (StudentGroup studentGroup : flow256) {
            System.out.println(StudentGroup);
        }

        System.out.println("\n\n*** ПОТОК №256 ***");
        List<StudentGroup> group = flow256.toList();
        Collections.sort(group);
        System.out.println(group);
    }
}
