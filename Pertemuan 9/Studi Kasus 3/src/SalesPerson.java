public class SalesPerson implements Comparable<SalesPerson> {
    private String firstName, lastName;
    private int totalSales;

    public SalesPerson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    public boolean equals(Object other) {
        return (lastName.equals(((SalesPerson) other).getLastName()) &&
                firstName.equals(((SalesPerson) other).getFirstName()));
    }

    @Override
    public int compareTo(SalesPerson other) {
        if (this.totalSales != other.totalSales) {
            return this.totalSales - other.totalSales;  // Descending totalSales
        }

        return other.lastName.compareTo(this.lastName); // Alphabetical order
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSales() {
        return totalSales;
    }
}
