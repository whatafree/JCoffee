


class c23248619 {
public static MyHelperClass session;
//public MyHelperClass session;
	public static MyHelperClass addRecipe(Lists o0, String o1, String o2, Users o3, int o4, int o5, int o6, Lists o7, String o8, MyHelperClass o9){ return null; }
//public MyHelperClass addRecipe(Lists o0, String o1, String o2, Users o3, int o4, int o5, int o6, Lists o7, String o8, MyHelperClass o9){ return null; }
	public static MyHelperClass createComment(Recipes o0, int o1, Users o2, String o3){ return null; }
	public static MyHelperClass createRecipeIngredients(Recipes o0, Ingredients o1, double o2, String o3){ return null; }
	public static MyHelperClass createRecipeIngredients(Recipes o0, Ingredients o1, int o2, String o3){ return null; }
public static MyHelperClass Arrays;
//	public MyHelperClass createRecipeIngredients(Recipes o0, Ingredients o1, int o2, String o3){ return null; }
//	public MyHelperClass createComment(Recipes o0, int o1, Users o2, String o3){ return null; }
//	public MyHelperClass createRecipeIngredients(Recipes o0, Ingredients o1, double o2, String o3){ return null; }
//public MyHelperClass Arrays;

    public static void main(String[] args) {
        try {
            MyHelperClass session = new MyHelperClass();
            Transaction transaction =(Transaction)(Object) session.beginTransaction();
            URL url1 = new URL("http://www.cs.huji.ac.il/~keren_ha/J2EE/keren.jpg");
            HttpURLConnection conn1 = (HttpURLConnection)(HttpURLConnection)(Object) url1.openConnection();
            conn1.connect();
            MyHelperClass Hibernate = new MyHelperClass();
            Users keren = new Users("kerenhaas@gmail.com", "123456", "keren", null, "sokolov 14 Raanana", Hibernate.createBlob(conn1.getInputStream(), conn1.getContentLength()), "about keren", "admin", false);
//            MyHelperClass session = new MyHelperClass();
            session.save(keren);
//            MyHelperClass session = new MyHelperClass();
            session.flush();
//            MyHelperClass session = new MyHelperClass();
            session.refresh(keren);
            URL url2 = new URL("http://www.cs.huji.ac.il/~keren_ha/J2EE/alex.jpg");
            HttpURLConnection conn2 = (HttpURLConnection)(HttpURLConnection)(Object) url2.openConnection();
//            MyHelperClass Hibernate = new MyHelperClass();
            Users alex = new Users("alex.uretsky@mail.huji.ac.il", "123456", "alex", null, null, Hibernate.createBlob(conn2.getInputStream(), conn2.getContentLength()), null, "admin", false);
//            MyHelperClass session = new MyHelperClass();
            session.save(alex);
//            MyHelperClass session = new MyHelperClass();
            session.flush();
//            MyHelperClass session = new MyHelperClass();
            session.refresh(alex);
            URL url3 = new URL("http://www.cs.huji.ac.il/~keren_ha/J2EE/julia.jpg");
            HttpURLConnection conn3 = (HttpURLConnection)(HttpURLConnection)(Object) url3.openConnection();
            conn3.connect();
//            MyHelperClass Hibernate = new MyHelperClass();
            Users julia = new Users("juliasht@gmail.com", "123456", "julia", null, null, Hibernate.createBlob(conn3.getInputStream(), conn3.getContentLength()), null, "admin", false);
//            MyHelperClass session = new MyHelperClass();
            session.save(julia);
//            MyHelperClass session = new MyHelperClass();
            session.flush();
//            MyHelperClass session = new MyHelperClass();
            session.refresh(julia);
            URL url4 = new URL("http://www.cs.huji.ac.il/~keren_ha/J2EE/meir.jpg");
            HttpURLConnection conn4 = (HttpURLConnection)(HttpURLConnection)(Object) url4.openConnection();
            conn4.connect();
//            MyHelperClass Hibernate = new MyHelperClass();
            Users meir = new Users("meir.spielrein@mail.huji.ac.il", "123456", "meir", null, null, Hibernate.createBlob(conn4.getInputStream(), conn4.getContentLength()), null, "admin", false);
//            MyHelperClass session = new MyHelperClass();
            session.save(meir);
//            MyHelperClass session = new MyHelperClass();
            session.flush();
//            MyHelperClass session = new MyHelperClass();
            session.refresh(meir);
            URL url5 = new URL("http://www.cs.huji.ac.il/~keren_ha/J2EE/miki.jpg");
            HttpURLConnection conn5 = (HttpURLConnection)(HttpURLConnection)(Object) url5.openConnection();
            conn5.connect();
//            MyHelperClass Hibernate = new MyHelperClass();
            Users miki = new Users("miki.shifman@mail.huji.ac.il", "123456", "miki", null, null, Hibernate.createBlob(conn5.getInputStream(), conn5.getContentLength()), null, "admin", false);
//            MyHelperClass session = new MyHelperClass();
            session.save(miki);
//            MyHelperClass session = new MyHelperClass();
            session.flush();
//            MyHelperClass session = new MyHelperClass();
            session.refresh(miki);
            URL url6 = new URL("http://www.cs.huji.ac.il/~keren_ha/J2EE/tamar.jpg");
            HttpURLConnection conn6 = (HttpURLConnection)(HttpURLConnection)(Object) url6.openConnection();
            conn6.connect();
//            MyHelperClass Hibernate = new MyHelperClass();
            Users tami = new Users("taamar@gmail.com", "123456", "tami", null, null, Hibernate.createBlob(conn6.getInputStream(), conn6.getContentLength()), null, "admin", false);
//            MyHelperClass session = new MyHelperClass();
            session.save(tami);
//            MyHelperClass session = new MyHelperClass();
            session.flush();
//            MyHelperClass session = new MyHelperClass();
            session.refresh(tami);
            Lists basicComplexity = new Lists("Complexity", "Basic");
//            MyHelperClass session = new MyHelperClass();
            session.save(basicComplexity);
            Lists mediumComplexity = new Lists("Complexity", "Medium");
//            MyHelperClass session = new MyHelperClass();
            session.save(mediumComplexity);
            Lists highComplexity = new Lists("Complexity", "High");
//            MyHelperClass session = new MyHelperClass();
            session.save(highComplexity);
            Lists chefComplexity = new Lists("Complexity", "Chef");
//            MyHelperClass session = new MyHelperClass();
            session.save(chefComplexity);
            Lists appetizers = new Lists("DishType", "Appetizers");
//            MyHelperClass session = new MyHelperClass();
            session.save(appetizers);
            Lists firstCourse = new Lists("DishType", "First Course");
//            MyHelperClass session = new MyHelperClass();
            session.save(firstCourse);
            Lists mainCourse = new Lists("DishType", "Main Course");
//            MyHelperClass session = new MyHelperClass();
            session.save(mainCourse);
            Lists dessert = new Lists("DishType", "Dessert");
//            MyHelperClass session = new MyHelperClass();
            session.save(dessert);
            Lists cocktails = new Lists("DishType", "Cocktails");
//            MyHelperClass session = new MyHelperClass();
            session.save(cocktails);
//            MyHelperClass session = new MyHelperClass();
            System.out.println("2 : " + session.isOpen());
            Lists italian = new Lists("Cuisine", "Italian");
//            MyHelperClass session = new MyHelperClass();
            session.save(italian);
            Lists chinese = new Lists("Cuisine", "Chinese");
//            MyHelperClass session = new MyHelperClass();
            session.save(chinese);
            Lists indian = new Lists("Cuisine", "Indian");
//            MyHelperClass session = new MyHelperClass();
            session.save(indian);
            Lists french = new Lists("Cuisine", "French");
            session.save(french);
            Lists thai = new Lists("Cuisine", "Thai");
            session.save(thai);
            Lists arabic = new Lists("Cuisine", "Arabic");
            session.save(arabic);
            Lists israeli = new Lists("Cuisine", "Israeli");
            session.save(israeli);
            Lists other = new Lists("Cuisine", "Other");
            session.save(other);
            Ingredients flour = new Ingredients("flour");
            session.save((Lists)(Object)flour);
            Ingredients sugar = new Ingredients("white sugar");
            session.save((Lists)(Object)sugar);
            Ingredients bakingPower = new Ingredients("baking powder");
            session.save((Lists)(Object)bakingPower);
            Ingredients groundNutmeg = new Ingredients("ground nutmeg");
            session.save((Lists)(Object)groundNutmeg);
            Ingredients salt = new Ingredients("salt");
            session.save((Lists)(Object)salt);
            Ingredients pepper = new Ingredients("pepper");
            session.save((Lists)(Object)pepper);
            Ingredients egg = new Ingredients("egg");
            session.save((Lists)(Object)egg);
            Ingredients milk = new Ingredients("milk");
            session.save((Lists)(Object)milk);
            Ingredients butter = new Ingredients("butter");
            session.save((Lists)(Object)butter);
            Ingredients groundCinnamon = new Ingredients("ground cinnamon");
            session.save((Lists)(Object)groundCinnamon);
            Ingredients strawberries = new Ingredients("strawberries");
            session.save((Lists)(Object)strawberries);
            Ingredients bisquick = new Ingredients("bisquick");
            session.save((Lists)(Object)bisquick);
            Ingredients whippedCream = new Ingredients("Whipped Cream");
            session.save((Lists)(Object)whippedCream);
            Ingredients potato = new Ingredients("potato");
            session.save((Lists)(Object)potato);
            Ingredients carrot = new Ingredients("carrot");
            session.save((Lists)(Object)carrot);
            Ingredients onion = new Ingredients("onion");
            session.save((Lists)(Object)onion);
            Ingredients ketchup = new Ingredients("ketchup");
            session.save((Lists)(Object)ketchup);
            Ingredients mustard = new Ingredients("mustard");
            session.save((Lists)(Object)mustard);
            Ingredients cookingCream = new Ingredients("Cooking Cream");
            session.save((Lists)(Object)cookingCream);
            Ingredients bread = new Ingredients("bread");
            session.save((Lists)(Object)bread);
            Ingredients caviar = new Ingredients("caviar");
            session.save((Lists)(Object)caviar);
            Ingredients foigra = new Ingredients("foigra");
            session.save((Lists)(Object)foigra);
            Ingredients vodka = new Ingredients("vodka");
            session.save((Lists)(Object)vodka);
            Ingredients orangeJuice = new Ingredients("orangeJuice");
            session.save((Lists)(Object)orangeJuice);
            Ingredients ribs = new Ingredients("ribs");
            session.save((Lists)(Object)ribs);
            Ingredients tomato = new Ingredients("tomato");
            session.save((Lists)(Object)tomato);
            Ingredients cucumber = new Ingredients("cucumber");
            session.save((Lists)(Object)cucumber);
            Ingredients oliveoil = new Ingredients("olive oil");
            session.save((Lists)(Object)oliveoil);
            Ingredients chickenBreast = new Ingredients("chicken Breast");
            session.save((Lists)(Object)chickenBreast);
            Ingredients apple = new Ingredients("apple");
            session.save((Lists)(Object)apple);
            Ingredients vanilla = new Ingredients("vanilla");
            session.save((Lists)(Object)vanilla);
            String description;
            description = "These muffins are delicious! The cinnamon sugar topping flavors them perfectly. This is my 10 year old brother's favorite recipe";
            Recipes rec1 =(Recipes)(Object) addRecipe(basicComplexity, description, "French Breakfast Muffins", keren, 10, 25, 12, dessert, "http://www.cs.huji.ac.il/~keren_ha/J2EE/muffins.jpg", Arrays.asList("Preheat oven to 350 degrees F (175 degrees C). Grease muffin cups or line with paper muffin liners.", "In a medium mixing bowl, stir together flour, 1/2 cup sugar, baking powder, nutmeg and salt. Make a well in the center of the mixture. Stir together egg, milk and 1/3 cup melted butter. Add egg mixture to flour mixture; stir until just moistened (batter may be lumpy). Spoon batter into prepared muffin cups.", "Bake in preheated oven for 20 to 25 minutes. Meanwhile, combine 1/4 cup sugar, cinnamon When muffins are finished baking, dip tops of muffins in the melted butter, and then in the cinnamon sugar mixture. Serve warm."));
            createRecipeIngredients(rec1, flour, 1.5, "cups");
            createRecipeIngredients(rec1, sugar, 0.5, "cups");
            createRecipeIngredients(rec1, bakingPower, 1.5, "teaspoons");
            createRecipeIngredients(rec1, groundNutmeg, 0.25, "teaspoons");
            createRecipeIngredients(rec1, salt, 0.125, "teaspoons");
            createRecipeIngredients(rec1, egg, 1, "lightly beaten");
            createRecipeIngredients(rec1, milk, 0.5, "cups");
            createRecipeIngredients(rec1, butter, 0.33, "cups");
            createRecipeIngredients(rec1, groundCinnamon, 0.25, "cups");
            createRecipeIngredients(rec1, groundCinnamon, 0.5, "teaspoon");
            createRecipeIngredients(rec1, sugar, 0.33, "cups");
            session.flush();
            session.refresh((Users)(Object)rec1);
            description = "This dish leaves even the biggest pasta lover satisfied. Fresh vegetables make this dish wonderful and it's easy to add meat to if you wish.";
            Recipes rec2 =(Recipes)(Object) addRecipe(mediumComplexity, description, "Veggie Pasta Minus the Pasta", alex, 30, 40, 6, mainCourse, "http://2.bp.blogspot.com/_wAVccjOeYzc/R4KYRa5MkLI/AAAAAAAAGz8/WeosqyuyjoQ/s400/vegetarian-tofu-curry-recipe+(13).JPG", Arrays.asList("Preheat an oven to 350 degrees F (175 degrees C). Arrange the tomatoes on a baking sheet with the cut sides facing up. ", "Roast the tomatoes in the preheated oven until cooked through and slightly browned on the underside, about 15 minutes. ", "Place squash halves face down in glass baking dish with the water; cover with plastic wrap. Microwave on High for 8 minutes. Leave covered and set aside. Once the squash is cool enough to handle, scrape in strands into a large bowl with a fork; season with salt and pepper and toss with 1 tablespoon olive oil. ", "Heat the remaining 2 tablespoons olive oil in a large skillet over medium-low heat; cook and stir the garlic, basil, and Italian seasoning in the oil until the garlic is softened, about 10 minutes. Add the onion, green bell pepper, eggplant, and carrot to the garlic; increase heat to medium. Continue cooking and stirring until the vegetables are nearly tender, 10 to 15 minutes. Mix the tomatoes and white wine into the vegetable mixture; cook another 2 to 3 minutes. Transfer the vegetables to the bowl with the spaghetti squash; gently toss together."));
            createRecipeIngredients(rec2, flour, 1.5, "cups");
            createRecipeIngredients(rec2, sugar, 0.5, "cups");
            createRecipeIngredients(rec2, bakingPower, 1.5, "teaspoons");
            createRecipeIngredients(rec2, groundNutmeg, 0.25, "teaspoons");
            createRecipeIngredients(rec2, salt, 0.125, "teaspoons");
            createRecipeIngredients(rec2, egg, 1, "lightly beaten");
            createRecipeIngredients(rec2, milk, 0.5, "cups");
            createRecipeIngredients(rec2, butter, 0.33, "cups");
            createRecipeIngredients(rec2, groundCinnamon, 0.25, "cups");
            createRecipeIngredients(rec2, groundCinnamon, 0.5, "teaspoon");
            createRecipeIngredients(rec2, sugar, 0.33, "cups");
            createComment(rec2, 1, julia, "This dish was extremely disappointing. I was very optimistic looking at the ingredient list, but after putting it all together, there was a profound lack of flavor. We eat a good deal of vegetable dishes, but this is not one we will be repeating.");
            createComment(rec2, 4, alex, "Very good, I also think to use less butter.");
            session.flush();
            session.refresh((Users)(Object)rec2);
            description = "A finger licking good strawberry cake!";
            Recipes rec3 =(Recipes)(Object) addRecipe(basicComplexity, description, "Strawberry short cake", alex, 60, 70, 12, dessert, "http://static.open.salon.com/files/coconut_strawberry_cake1226877577.jpg", Arrays.asList("Sprinkle strawberries with 2/3 cups sugar. Let stand 1 hour ", "Heat over to 425 degrees.", "Mix all ingredients and place in the over", "Slice it and eat up!"));
            createRecipeIngredients(rec3, strawberries, 1.5, "cups");
            createRecipeIngredients(rec3, sugar, 0.66, "cups");
            createRecipeIngredients(rec3, bisquick, 2, "boxese");
            createRecipeIngredients(rec3, sugar, 3, "tablespoons");
            createRecipeIngredients(rec3, milk, 0.5, "cups");
            createRecipeIngredients(rec3, whippedCream, 0.75, "cups");
            createComment(rec3, 5, julia, "Best cake I ever had!!! Kudos!!");
            session.flush();
            session.refresh((Users)(Object)rec3);
            description = "My secret Barbecue Beef Short Ribs recipe revealed!";
            Recipes rec4 =(Recipes)(Object) addRecipe(highComplexity, description, "Short Ribs", meir, 70, 500, 6, mainCourse, "http://farm2.static.flickr.com/1310/1237575824_9068241a81.jpg", Arrays.asList("Put the potatoes and carrots in a large slow cooker", "Top with the onion wedges then the beef", "Combine the ketchup, , mustrard and salt", "Put ofver the beef", "Cook on LOW for 8 to 10 hours"));
            createRecipeIngredients(rec4, potato, 10, "pieces");
            createRecipeIngredients(rec4, carrot, 1, "cups");
            createRecipeIngredients(rec4, onion, 2, "units");
            createRecipeIngredients(rec4, ribs, 3.5, "pounds");
            createRecipeIngredients(rec4, ketchup, 1, "cups");
            createRecipeIngredients(rec4, mustard, 0.5, "teaspoon");
            createComment(rec4, 4, keren, "My whole family loved it!");
            createComment(rec4, 5, alex, "This was outstanding, will definitely use this recipe often. I used chicken legs as that was what I had and it worked great. thanks!!!!");
            session.flush();
            session.refresh((Users)(Object)rec4);
            description = "a simple, yet yasty, Salad";
            Recipes rec5 =(Recipes)(Object) addRecipe(basicComplexity, description, "Garden Salad", alex, 10, 15, 6, firstCourse, "http://ww-recipes.net/wp-content/uploads/2008/09/weight-watchers-arabic-salad-recipe.jpg", Arrays.asList("Slice the tomatoes to cubes", "Slice the cucumbers to julian strips", "add a pinch salt and pepper", "top with olive oil"));
            createRecipeIngredients(rec5, tomato, 3, "pieces");
            createRecipeIngredients(rec5, cucumber, 3, "pieces");
            createRecipeIngredients(rec5, oliveoil, 2, "tablespoons");
            createRecipeIngredients(rec5, salt, 1, "pinch");
            createRecipeIngredients(rec5, pepper, 1, "pinch");
            createComment(rec5, 5, julia, "Delicious and so easy to make!");
            session.flush();
            session.refresh((Users)(Object)rec5);
            description = "Creme Brule - the full recipe! no shortcuts ;) ";
            Recipes rec7 =(Recipes)(Object) addRecipe(highComplexity, description, "Creme brule", miki, 30, 200, 6, dessert, "http://www.cookingforengineers.com/hello/259/958/640/IMG_3335_sharp.jpg", Arrays.asList("bring the cooking cream to boiling temperature", "insert vanilla stick", "whisk eggs with sugar", "add cream to eggs CAREFULLY", "put in over for 30 minutes, then to the fridge for 4 hours"));
            createRecipeIngredients(rec7, cookingCream, 2, "cartons");
            createRecipeIngredients(rec7, egg, 3, "yolks");
            createRecipeIngredients(rec7, sugar, 2, "tablespoons");
            createRecipeIngredients(rec7, vanilla, 1, "stick");
            createComment(rec7, 4, julia, "Delicious and so easy to make!");
            session.flush();
            session.refresh((Users)(Object)rec7);
            description = "some toasts with foigra to get the meal started";
            Recipes rec8 =(Recipes)(Object) addRecipe(basicComplexity, description, "foigra on toast", alex, 15, 15, 6, appetizers, "http://www.italiq-expos.com/news/images/Gastronomie/Foie-gras/assiette-foie-gras.jpg", Arrays.asList("cut bread into oval slices", "place in toaster until a golden brown color in formed", "speard some foigra pate on the toasts", "optional - add some baluga caviar on top"));
            createRecipeIngredients(rec8, bread, 6, "slices");
            createRecipeIngredients(rec8, foigra, 1, "can");
            createRecipeIngredients(rec8, caviar, 1, "minijar");
            createComment(rec8, 5, julia, "Delicious and so easy to make!");
            session.flush();
            session.refresh((Users)(Object)rec8);
            description = "delicious diatetic chicken steak";
            Recipes rec9 =(Recipes)(Object) addRecipe(mediumComplexity, description, "chicken steak", meir, 15, 20, 2, mainCourse, "http://4.bp.blogspot.com/_jhlSdMizhlU/RdOVtm-0QAI/AAAAAAAAABg/81W-JvXOACI/s400/Chicken_Steak.jpg", Arrays.asList("Heat a frying pan with some (preferably olive) oil", "when the oil is hot, place the chicken and onions in the middle", "fry on both sides on medium flame until it starts to turn golden", "season with salt and pepper"));
            createRecipeIngredients(rec9, chickenBreast, 2, "pieces");
            createRecipeIngredients(rec9, onion, 1, "piece");
            createRecipeIngredients(rec9, salt, 1, "pinch");
            createRecipeIngredients(rec9, pepper, 1, "pinch");
            createComment(rec9, 5, julia, "Delicious and so easy to make!");
            session.flush();
            session.refresh((Users)(Object)rec9);
            Favorites fav1 = new Favorites(keren, rec1, null);
            session.save((Lists)(Object)fav1);
            Favorites fav2 = new Favorites(keren, rec2, null);
            session.save((Lists)(Object)fav2);
            Favorites fav3 = new Favorites(keren, rec3, null);
            session.save((Lists)(Object)fav3);
            Favorites fav4 = new Favorites(keren, rec4, null);
            session.save((Lists)(Object)fav4);
            Favorites fav5 = new Favorites(alex, rec4, null);
            session.save((Lists)(Object)fav5);
            Favorites fav6 = new Favorites(alex, rec2, null);
            session.save((Lists)(Object)fav6);
            RecentlyViewed recViewed1 = new RecentlyViewed(keren, rec1, new Date());
            session.save((Lists)(Object)recViewed1);
            RecentlyViewed recViewed2 = new RecentlyViewed(keren, rec2, new Date());
            session.save((Lists)(Object)recViewed2);
            Friends friend1 = new Friends(keren, alex, true);
            session.save((Lists)(Object)friend1);
            Friends friend2 = new Friends(alex, keren, true);
            session.save((Lists)(Object)friend2);
            Friends friend3 = new Friends(keren, julia, false);
            session.save((Lists)(Object)friend3);
            Friends friend4 = new Friends(keren, meir, true);
            session.save((Lists)(Object)friend4);
            Friends friend5 = new Friends(meir, keren, true);
            session.save((Lists)(Object)friend5);
            Friends friend6 = new Friends(tami, keren, false);
            session.save((Lists)(Object)friend6);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass asList(String o0, String o1, String o2, String o3){ return null; }
	public MyHelperClass createBlob(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass asList(String o0, String o1, String o2){ return null; }
	public MyHelperClass save(Lists o0){ return null; }
	public MyHelperClass save(Users o0){ return null; }
	public MyHelperClass asList(String o0, String o1, String o2, String o3, String o4){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass isOpen(){ return null; }
	public MyHelperClass refresh(Users o0){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass beginTransaction(){ return null; }}

class Transaction {

public MyHelperClass commit(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass connect(){ return null; }}

class Users {

Users(){}
	Users(String o0, String o1, String o2, Object o3, String o4, MyHelperClass o5, String o6, String o7, boolean o8){}
	Users(String o0, String o1, String o2, Object o3, Object o4, MyHelperClass o5, Object o6, String o7, boolean o8){}}

class Lists {

Lists(){}
	Lists(String o0, String o1){}}

class Ingredients {

Ingredients(String o0){}
	Ingredients(){}}

class Recipes {

}

class Favorites {

Favorites(){}
	Favorites(Users o0, Recipes o1, Object o2){}}

class RecentlyViewed {

RecentlyViewed(){}
	RecentlyViewed(Users o0, Recipes o1, Date o2){}}

class Date {

}

class Friends {

Friends(){}
	Friends(Users o0, Users o1, boolean o2){}}
