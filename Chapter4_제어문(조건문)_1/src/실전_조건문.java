//import org.jsoup.select.Elements;
///*
// * <td class = "info">
// * 						<a href="#" class="title>
// */
//public class 실전_조건문 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
//		javax.lang.model.util.Elements title = doc.select("td.info a.title");
//		Scanner scan = new Scanner(System.in);
//		System.out.print("검색어:");
//		String fd = scan.next();
//		for(int i=0;i<title.size();i++)
//		{
//			if(title.get(i).text().contains(fd))
//			System.out.printin((i+1)+"."+title.get(i).text());
//		}
//	}
//
//}
