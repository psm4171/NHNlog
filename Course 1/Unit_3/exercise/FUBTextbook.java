package Unit_3.exercise;

public class FUBTextbook extends TextBooks {

    private String faculty;

    public FUBTextbook(String title, String author, String course, String faculty) {
        super(title, author, course);
        this.faculty = faculty;
    }

    public String getFaculty(){
        return faculty;
    }

    // 시각화 메서드를 재정의
    @Override
    public void printBook(){
        System.out.println("-------UniversityOfBolzano-------");
        System.out.println("제목 : " + super.getTitle());
        System.out.println("저자 : " + super.getAuthor());
        System.out.println("학부 : " + getFaculty());
    }



}
