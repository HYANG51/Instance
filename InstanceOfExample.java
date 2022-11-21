package java_LJH_instance_example;
class Boxx{
	public void simpleWrap() {
		System.out.println("Simple Wrapping");
	}
}

class PaperBox extends Boxx{
	public void paperWrap() {
		System.out.println("Paper Wrapping");
	}
}

class GoldPaperBox extends PaperBox{
	public void goldWrap() {
		System.out.println("Gold Wrapping");
	}
}
public class InstanceOfExample {
	public static void main(String[] args) {
		Boxx box1 = new Boxx();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();

		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
	}

	public static void wrapBox(Boxx box) {
		if(box instanceof GoldPaperBox) {
			//GoldPaperBox gold = (GoldPaperBox) box;
			//gold.goldWrap();
			
			((GoldPaperBox)box).goldWrap();		// 위의 두 문장이랑 이 한 문장이랑 동일함.
		}else if(box instanceof PaperBox) {
			((PaperBox)box).paperWrap();
		}else {
			box.simpleWrap();
		}
	}
}
