import java.util.ArrayList;

public class comuna {

	private int ID;
	private int cost1;
	private int cost2;
	private ArrayList<Integer>cobertura= new ArrayList();
	
	
	public comuna(int ID,int cost1,int cost2){
		this.ID=ID;
		this.cost1=cost1;
		this.cost2=cost2;
		
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public int getCost1() {
		return cost1;
	}


	public void setCost1(int cost1) {
		this.cost1 = cost1;
	}


	public int getCost2() {
		return cost2;
	}


	public void setCost2(int cost2) {
		this.cost2 = cost2;
	}


	public void  addCobertura(int id) {
		cobertura.add(id);
		
	}


	public void setCobertura(ArrayList<Integer> cobertura) {
		this.cobertura = cobertura;
	}
	
}
