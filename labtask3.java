class SY2022bit001{
public int getValidRegistrationsCountTask3(String []number){
	int count =0;
	boolean isValid =false;
	if(number == null){
		return -1;
	}
	for(int i=0;i<number.length;i++){
		isValid =false;
		if(number[i] == null || number[i].length() != 10){
			continue;
	}
		else{
			for(int j=0;j<number[i].length();j++){
				if(j < 4 || (j >= 7 && j < number[i].length())){
				
					char charAtInd = number[i].charAt(j);
					if(Character.isDigit(charAtInd)){	
						isValid = true;
					}
					else{
					    isValid = false;
					    break;
					}
				}
				else{
					Integer year = Integer.parseInt(number[i].substring(0, 4));
					if(year >= 2000 && year <=2024)
					{
						isValid = true;
				}
					else{
					    isValid =false;
					    break;
					}
				}
				if(j >= 4 && j < 7){
					String departmentId = number[i].substring(4,7);
					if(departmentId.equalsIgnoreCase("bit") || departmentId.equalsIgnoreCase("bcs") || departmentId.equalsIgnoreCase("bme") || departmentId.equalsIgnoreCase("bch")){
						isValid =true;
						String num=number[j].substring(7,10);
						String zero="000";
						String max="050";
						int a=zero.hashcode();
						int b=zero.hashcode();
						int c=num.hashcode();
						if(f>a&&f<=b){
							count++
						}
						
						
					}
					
			       }
			}
			long end=System.nanotime();
			long eclapsed=end-start;
			System.out.println("time:"+eclapsed+"nanoseconds");
			return count;
		}
	}	
}
public static void main(String[] args){
	String []RegNum = {null,"2023bsd501","2022bit201","2021BCS001","2025bit111","2023bme039","2004bch342"};
	SY2022bit001 data = new SY2022bit001();
	int count  =data.getValidRegistrationsCountTask3(RegNum);
	System.out.println(count);
	}
}
