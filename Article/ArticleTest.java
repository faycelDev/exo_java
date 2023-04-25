package Article;

public class ArticleTest {

    public static void main(String[] args) {

        Article article = new Article(1021, "tricot", 100, 20);

        article.afficher();

        Article article1 = new Article(2020, "jeans");
        article1.afficher();

        Article article2 = new Article();
        article2.afficher();

    }
}
