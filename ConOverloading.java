package java_LJH_instance_example;

class Player {
    private int regiNum;     // 주민등록 번호
    private int passNum;     // 여권 번호
    
    Player(int rnum, int pnum) {
        regiNum = rnum;
        passNum = pnum;
    }
    
    Player(int rnum) {
        regiNum = rnum;
        passNum = 0;
    }
    
    void showPersonalInfo() {
        System.out.println("주민등록 번호: " + regiNum);
        
        if(passNum != 0)
            System.out.println("여권 번호: " + passNum + '\n');
        else
            System.out.println("여권을 가지고 있지 않습니다. \n");
    }
}

class ConOverloading {
    public static void main(String[] args) {
        // 여권 있는 사람의 정보를 담은 인스턴스 생성
        Player jung = new Player(335577, 112233);
        
        // 여권 없는 사람의 정보를 담은 인스턴스 생성
        Player hong = new Player(775544);

        jung.showPersonalInfo();
        hong.showPersonalInfo();
    }
}