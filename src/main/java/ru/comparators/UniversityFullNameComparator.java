package ru.comparators;
import org.apache.commons.lang3.StringUtils;
import ru.mylov.University;

public class UniversityFullNameComparator implements UniversityComparator{
    @Override
    public int compare(University o1, University o2) {
        return StringUtils.compare(o1.getFullName(), o2.getFullName());
    }
}
