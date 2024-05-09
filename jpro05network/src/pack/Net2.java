package pack;

import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

// 제 3자가 제공하는 라이브러리(jsoup.jar)를 사용해 웹 스크래핑
// HTML 문서 데이터 구문 분석, 추출 및 조작용 오픈 소스

public class Net2 {

	public static void main(String[] args) {
		// 위키백과 사이트에서 검색 결과 읽기
		// https://ko.wikipedia.org/wiki/%EB%A7%A8%EC%B2%B4%EC%8A%A4%ED%84%B0_%EC%9C%A0%EB%82%98%EC%9D%B4%ED%8B%B0%EB%93%9C_FC
		
		try {
			
			String url = "https://ko.wikipedia.org/wiki" + URLEncoder.encode("맨체스터_유나이티드_FC", "UTF-8");
			// Document : 웹페이지 문서
			Document doc = Jsoup.connect(url).get();
			String text = doc.text();
			// System.out.println(text);
			
			printkoreanText(text);
		} catch (Exception e) {
			System.out.println("err : " + e);
		}

	}

	private static void printkoreanText(String text) {
		// 정규 표현식 사용
		// 한글과 공백만 얻기 
		Pattern pattern = Pattern.compile("[가-힣\\s]+");
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()) {
			String line = matcher.group().trim();
			if(!line.isEmpty()) { // 빈 줄은 제외
				System.out.println(line);
				
			}
		}
		
	}

}
