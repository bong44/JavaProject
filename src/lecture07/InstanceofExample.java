package lecture07;

public class InstanceofExample {
	public static void method1(DmbCellPhone dmbCellPhone) {
		if (dmbCellPhone instanceof CellPhone) {
			CellPhone cellPhone = (CellPhone) dmbCellPhone;
			System.out.println();
		}
		
	}
}


