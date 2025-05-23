package InteractableObj;

import Main.GamePanel;
import Util.Animator;
import Util.TypesOfSuperObj;

public class Key extends SuperObject{

	public Key(GamePanel gp, int id, int xStartPos, int yStartPos){
		type = TypesOfSuperObj.KEY;
		name = type.getName();
		this.id = id;
		start(gp, xStartPos, yStartPos);
		path = "/Assets/Props_Items_(animated)/"+name+"_anim.png";
		anim = new Animator(gp, path, frameRate);
	}
}
