package bylance;

import java.util.ArrayList;
import java.util.List;

public class o5�������� {
	public static void main(String[] args) {
		
	}
	
	
	public List<Integer> spiralOrder(int[][] matrix) {
		
		//����
		if (matrix.length == 0) {
			return new ArrayList<>();
		}
		
		//��ʼ��
		int l = 0;  //����
		int r = matrix[0].length - 1; //����
		int t = 0;  //����
		int b = matrix.length - 1; //����
		
		//�����
		ArrayList<Integer> list = new ArrayList<>();
		
		while (true) {
			
			//����
			for (int i = l;i <= r;i++) {
				list.add(matrix[t][i]);
			}
			
			//++t:�ȸ�t��1��Ȼ����t����ֵ
			//t++:����t��ԭֵ��Ȼ��t��1
			//���������ߣ����ǵ�����
			if (++t > b) break;
			
			//���ϵ���
			for (int i = t;i <= b;i++) {
				list.add(matrix[i][r]);
			}
			//����������
			if (l> --r) break;
			
			//��������
			for (int i = r;i >= l;i--) {
				list.add(matrix[b][i]);
			}
			//����������
			if (t > --b) break;
			
			//��������
			for (int i = b;i >= t;i--) {
				list.add(matrix[i][l]);
			}
			//����������
			if (++l > r) break;
			
		}
		
		return list;
    }
}
