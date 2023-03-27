package session13;

public class AccessEmpData {

    public static void main(String[] args) {

        EmployeeData obj = new EmployeeData();
        obj.getEmpAge();
        obj.getEmpName();
        obj.getSsn();

        obj.setSsn(1014544544);
        obj.setEmpName("Manju");
        obj.setEmpAge(34);

        System.out.println();

    }
}
