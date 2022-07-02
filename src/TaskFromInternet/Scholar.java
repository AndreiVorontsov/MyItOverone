package TaskFromInternet;

public class Scholar {
    public static void main(String[] args) {
//        ScholarSchedule schedule = new ScholarSchedule(DayOfWeek.MONDAY);
//        schedule.setDayOfWeek(DayOfWeek.MONDAY);
        Scholar scholar = new Scholar();
        scholar.wakeUp();

    }
    private ScholarSchedule schedule = new ScholarSchedule();

    private boolean goToSchool;

    public void wakeUp() {

        if (this.schedule.getDayOfWeek() == DayOfWeek.SUNDAY) {
            System.out.println("Ура, можно поспать еще!");
        } else {
            System.out.println("Блин, опять в школу:(");
        }
    }
}
