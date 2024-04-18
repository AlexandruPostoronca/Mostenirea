public enum DayWeek {
    Monday(1), Tuesday(2), Wednesday(3), Thursday(4), Friday(5), Saturday(6), Sunday(7);

    int number;

    DayWeek(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
    public String toString(){
        return "Numarul de ordene este: "+number;
    }
}
