public class ApartmentOwner {
    private String owner;
    private String[] apartments;

    ApartmentOwner(String owner){
        this.owner = owner;
        apartments = new String[10];
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setApartments(int slot) {

    }

    public String[] getApartments() {
        return apartments;
    }

//    public int countApartments(){
//
//    }




}
