package CoreJava;

import java.util.Comparator;

public class ClassC152 implements Comparator<ClassA152>
{
    public int compare(ClassA152 o1, ClassA152 o2)
    {
        // return o1.getEmpId() - o2.getEmpId();
        // return o1.getEmpName().compareTo(o2.getEmpName());
        return o1.getEmpDept().compareTo(o2.getEmpDept());
    }
}
