package company;

public class Company {
    static String companyName;
    final int employeeID;
    String employeeName;

    static {
        companyName = "AF";
    }

    Company(int someEmployeeID, String someEmployeeName) {
        this.employeeID = someEmployeeID;
        this.employeeName = someEmployeeName;
    }

    String getEmployeeName() {
        return this.employeeName;
    }

    void setEmployeeName(String newEmployeeName) {
        this.employeeName = newEmployeeName;
    }

    static void printCompanyName() {
        System.out.println(companyName);
    }

    void setCompanyName(String newCompanyName) {
        companyName = newCompanyName;
    }

}
