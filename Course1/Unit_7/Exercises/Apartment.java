package Exercises;

public class Apartment {
    private int size;
    private String address;
    private String [] resident;
    private int numberOfResidents;

    public Apartment(int size, String address) {
        this.size = size;
        this.address = address;
        resident = new String[10];
        this.numberOfResidents = 0;
    }

    public int getNumberOfResidents(){
        return numberOfResidents;
    }

    public int getSize() {
        return size;
    }

    public String getAddress() {
        return address;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addResident(String name){
        if(numberOfResidents < 10){
            resident[numberOfResidents] = name;
            numberOfResidents++;
        }
    }

    // 번호에 해당하는 이름
    public String residentByNum(int num){
        if(num >= 0 && num < numberOfResidents){
            return resident[num];
        }
        else {
            return null;
        }
    }

    public void removeResident(int num){
        if(num >= 0 && num < numberOfResidents){
            for(int i = num; i < numberOfResidents - 1; i++){
                resident[i] = resident[i + 1];
            }
            numberOfResidents--;
        }
    }

    public String[] getResident() {
        return resident;
    }

    @Override
    public String toString() {

        StringBuilder info = new StringBuilder();
        info.append("평 수 : ").append(size).append("\n");
        info.append("주소 : ").append(address).append("\n");
        info.append("거주자 수 : ").append(getNumberOfResidents()).append("\n");
        info.append("거주자 명 \n");
        for (int i = 0; i < numberOfResidents; i++) {
            info.append(i + 1).append("층 : ").append(resident[i]).append("\n");
        }
        return info.toString();
    }

}
