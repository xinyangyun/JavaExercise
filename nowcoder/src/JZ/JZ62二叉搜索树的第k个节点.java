package JZ;

public class JZ62�����������ĵ�k���ڵ� {

	int index = 0;//������
	
	TreeNode KthNode(TreeNode pRoot, int k)
    {
		
		//˼·�������������������������˳���ӡ�������þ�������õ�˳��
		//���ԣ������������˳���ҵ���k���ڵ���ǽ��
		
		if (pRoot != null) { //�������Ѱ�ҵ�k��
			TreeNode node = KthNode(pRoot.left, k);
			if (node!=null) {
				return node;
			}
			index++;
			if (index == k) {
				return pRoot;
			}
			node = KthNode(pRoot.right, k);
			if (node!=null) {
				return node;
			}
		}
		
		return null;//���Ϊnullֱ�ӷ���null
    }
	
}
