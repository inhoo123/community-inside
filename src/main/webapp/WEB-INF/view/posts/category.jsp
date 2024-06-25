<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>뉴스 메인 페이지</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }
        .container {
            width: 80%;
            margin: 0 auto;
            background-color: #fff;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .header {
            text-align: center;
            margin-bottom: 20px;
        }
        .header h1 {
            margin: 0;
            font-size: 2.5em;
        }
        .nav {
            display: flex;
            justify-content: center;
            margin-bottom: 40px;
        }
        .nav a {
            margin: 0 15px;
            text-decoration: none;
            color: #555;
            font-size: 1.2em;
        }
        .nav a:hover {
            color: #000;
        }
        .category {
            margin-bottom: 40px;
        }
        .category h2 {
            font-size: 2em;
            border-bottom: 2px solid #ddd;
            padding-bottom: 10px;
            margin-bottom: 20px;
        }
        .news-item {
            margin-bottom: 20px;
        }
        .news-item h3 {
            font-size: 1.5em;
            margin: 0;
        }
        .news-item p {
            margin: 5px 0;
            color: #666;
        }
        .news-item a {
            text-decoration: none;
            color: #3498db;
        }
        .news-item a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="header">
            <h1>뉴스 메인 페이지</h1>
        </div>
        <div class="nav">
            <a href="#entertainment">연애</a>
            <a href="#current-affairs">시사</a>
            <a href="#sports">스포츠</a>
            <a href="#technology">기술</a>
            <a href="#health">건강</a>
        </div>
        <div id="entertainment" class="category">
            <h2>연애</h2>
            <div class="news-item">
                <h3><a href="news1.html">연애 뉴스 제목 1</a></h3>
                <p>연애 뉴스 내용 요약...</p>
            </div>
            <div class="news-item">
                <h3><a href="news2.html">연애 뉴스 제목 2</a></h3>
                <p>연애 뉴스 내용 요약...</p>
            </div>
        </div>
        <div id="current-affairs" class="category">
            <h2>시사</h2>
            <div class="news-item">
                <h3><a href="news3.html">시사 뉴스 제목 1</a></h3>
                <p>시사 뉴스 내용 요약...</p>
            </div>
            <div class="news-item">
                <h3><a href="news4.html">시사 뉴스 제목 2</a></h3>
                <p>시사 뉴스 내용 요약...</p>
            </div>
        </div>
        <div id="sports" class="category">
            <h2>스포츠</h2>
            <div class="news-item">
                <h3><a href="news5.html">스포츠 뉴스 제목 1</a></h3>
                <p>스포츠 뉴스 내용 요약...</p>
            </div>
            <div class="news-item">
                <h3><a href="news6.html">스포츠 뉴스 제목 2</a></h3>
                <p>스포츠 뉴스 내용 요약...</p>
            </div>
        </div>
        <div id="technology" class="category">
            <h2>기술</h2>
            <div class="news-item">
                <h3><a href="news7.html">기술 뉴스 제목 1</a></h3>
                <p>기술 뉴스 내용 요약...</p>
            </div>
            <div class="news-item">
                <h3><a href="news8.html">기술 뉴스 제목 2</a></h3>
                <p>기술 뉴스 내용 요약...</p>
            </div>
        </div>
        <div id="health" class="category">
            <h2>건강</h2>
            <div class="news-item">
                <h3><a href="news9.html">건강 뉴스 제목 1</a></h3>
                <p>건강 뉴스 내용 요약...</p>
            </div>
            <div class="news-item">
                <h3><a href="news10.html">건강 뉴스 제목 2</a></h3>
                <p>건강 뉴스 내용 요약...</p>
            </div>
        </div>
    </div>
</body>
</html>
