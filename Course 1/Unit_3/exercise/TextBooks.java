package Unit_3.exercise;

public class TextBooks extends Book{
    private String course;
    public TextBooks(String title, String author, String course) {
        super(title, author);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }


    // 시각화 메서드를 재정의
    @Override
    public void printBook(){
        System.out.println("-------TextBooks-------");
        System.out.println("제목 : " + super.getTitle());
        System.out.println("저자 : " + super.getAuthor());
        System.out.println("책의 유형 : " + getCourse());

    }

}
