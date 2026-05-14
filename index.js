const { MainAPI, newMovieSearchResponse, newHomePageResponse } = require('cloudstream');

class CeeIraq extends MainAPI {
    constructor() {
        super();
        this.name = "CEE Iraq";
        this.mainUrl = "https://cee.buzz";
        this.lang = "ar";
    }

    // جلب أفلام الصفحة الرئيسية تلقائياً
    async getMainPage() {
        const html = await this.app.get(this.mainUrl);
        const movies = html.document.select("div.item"); // استهداف عناصر الفيلم

        const list = movies.map(m => {
            const title = m.selectFirst(".title").text;
            const poster = m.selectFirst("img").attr("src");
            const link = m.selectFirst("a").attr("href");
            
            return newMovieSearchResponse(title, link, "movie", poster);
        });

        return [newHomePageResponse("المضاف حديثاً", list)];
    }

    // استخراج رابط الفيديو عند النقر
    async loadLinks(url) {
        const html = await this.app.get(url);
        const videoUrl = html.document.selectFirst("source").attr("src");
        
        return [{
            url: videoUrl,
            quality: 1080,
            name: "Direct Link"
        }];
    }
}

module.exports = new CeeIraq();
