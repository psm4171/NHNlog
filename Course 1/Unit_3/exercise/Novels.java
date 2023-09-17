package Unit_3.exercise;

public class Novels extends Book{
    private String type;
    public Novels(String title, String author, String type) {
        super(title, author);
        this.type = type;
    }

    public String getType() {
        return type;
    }


    // 시각화 메서드를 재정의
    @Override
    public void printBook(){
        System.out.println("-------Novels-------");
        System.out.println("제목 : " + super.getTitle());
        System.out.println("저자 : " + super.getAuthor());
        System.out.println("책의 유형 : " + getType());
    }
}
