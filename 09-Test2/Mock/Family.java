public class Family {

    public Person[] members;

    public Family(Person[] members) {
        this.members = members;
    }

    public int adults() {
        int numOfAdults = 0;
        
        for (Person person : members) {
            if (person.getAge() >= 18) {

                numOfAdults += 1;
            }
        }
    return numOfAdults;
    }
}
