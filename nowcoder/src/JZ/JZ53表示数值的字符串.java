package JZ;

public class JZ53��ʾ��ֵ���ַ��� {

	public boolean isNumeric(char[] str) {

		if (str.length == 0) {
			return false;
		}
		
		//����Ƿ�������ͬ���
		boolean numSeen = false;
		boolean dotSeen = false;
		boolean eSeen = false;
		
		for (int i = 0;i < str.length;i++) {
			if (str[i] >= '0' && str[i] <= '9') {
				numSeen = true;
			}else if (str[i] == '.') {
				//.֮ǰ���ܳ���.��e
				if(dotSeen||eSeen) {
					return false;
				}
				dotSeen = true;
			}else if(str[i] == 'e' || str[i] == 'E') {
				//e֮ǰ���ܳ���e�����������
				if (eSeen || !numSeen) {
					return false;
				}
				eSeen = true;
				numSeen = false;//����numSeen,�ų�123e����123e+�������ȷ��e֮��Ҳ������
			}else if (str[i] == '-' || str[i] == '+') {
				//+-������0λ�û���e/E�ĺ����һ��λ�ò��ǺϷ���
				if (i!=0 && str[i-1] !='e' && str[i-1] != 'E') {
					return false;
				}
			}else {//�������Ϸ�
				return false;
			}
		}
		
		return numSeen;
	}

}
