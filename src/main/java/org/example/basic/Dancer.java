package org.example.basic;


import static org.example.basic.DanceLevel.*;

public class Dancer {

    private final String crewName; // 팀의 이름
    private final String myName; // 내 이름
    private DanceLevel level =  MIDDEL; // 춤 수준(전문가, 중수, 하수, 초보자)
    // 스트레칭 여부
    private boolean stretch;
    // 유연성 운동 여부
    private boolean flexible;

    public Dancer(){
        this("기본크루","이름없음");
        System.out.println("그냥 댄서 생성");
    }
    public Dancer(String crewName, String myName){
        this.crewName = crewName;
        this.myName = myName;
        System.out.println("아이돌 댄서 생성");
    }
    // 스트레칭
    private void stretch() {
        System.out.println(myName + "님이 스트레칭합니다.");
        this.stretch = true;
    }
    // 다리찢기
    private void makeFlexible() {
        if(!stretch) {
            System.out.println("스트레칭을 안해서 죽었습니다.");
            return;
        }else{
            System.out.println(myName + "님이 유연성 운동을 합니다.");
            this.flexible = true;
        }
    }
    //춤추기
    public void dance() {
        stretch();
        makeFlexible();
        if(!flexible) {
            System.out.println("유연성 운동을 하지 않아서 죽었습니다.");
            return;
        }
        System.out.println(myName + "님이 춤을 춥니다.");
    }

}