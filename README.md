# Developer Designer Workflow

## Introduction

* I'm Lexi I do....
	* Design
	* Frontend
* I'm Doug I do...
	* Java
	* Backend
* Tonight we're talking about
	* Developer/Designer workflow
	* Frontend / Backend workflow
* Introduce project
	* Recipe sharing application

## Feature list

**Done by:**

	Lexi and Doug

**Demo:**

* List out features
	* List
	* Search
	* View
	* Create

**Core Concepts:**

* Kickoff meeting
* Planning and everyone on same page
* Project roadmap  

## Whiteboard

**Done by:**

	Lexi and Doug

**Demo:**

* Draw UI concept on whiteboard
	* Search / List
	* View
	* Create

**Core Concepts:**

* Communication
* Disposable and fast
* Focus on how this is good for designers / UX to think about how users use an application
* Easy to change

## Design in Sketch

**Done by:**

	Lexi

**Demo:**

* Create/show mockups in Sketch

**Core Concepts:**

* Sketch is a design tool used on Macs that helps designers create full color mockups. Its an alternative to Photoshop or Illustrator
* Mockups / designs help you visualize how a project will look before you touch a line of code.
* Keeps you from wasting times
* Should create all levels of responsiveness (mobile and desktop)

## Project setup

**Done by:**

	Doug

**Demo:**

* Create a Github repo
	* `tiy-foodster-cc`
	* Add Lexi as collaborator
* Clone repo
* Create a Spring project in IntelliJ
	* **Web** 
	* **Thymeleaf** - to make Lexi's HTML show my data
	* **JDBC** - to connect to databases
	* **Postgres** - a tool that knows how to talk to the database we're using
	* **Devtools** - a tool to make running code faster in development
* Push to Github

**Core Concepts:**

* Github is a tool for collaboration on software projects
	* Projects hold code
	* Collaborators can update the code in the project
* Git works with Github
	* Source code control system
	* Timeline of changes
	* Keeps track of the changes we've made (versions)
	* Can push and pull code to/from github
* IntelliJ is a tool to edit Java source code.
	* Source code is the set of files that make up a project.
	* Projects are collections of related files.
	* We are creating a Spring Boot project.
		* Spring is a framework for organizing and simplify my code.
* Pushing in Git is how I share my code with Lexi

## 1. Initial Search HTML

**Done By:**

	Lexi

**Demo:**

* Clone from Github
	* `git clone git@github.com:dhughes/tiy-foodster-cc.git`
* Create templates and static folders (goes into src > main > resources) and add index / css / js
* Create CSS and JS folders
* Create empty files for
	* [index.html](https://raw.githubusercontent.com/dhughes/tiy-developer-designer-crashcourse/master/initial_html/index.html)
	* recipe.html
	* recipeForm.html
*  CSS files for Search
	* [style.css](https://raw.githubusercontent.com/dhughes/tiy-developer-designer-crashcourse/master/initial_html/style.css)
* Add placeholder images from web. Kittens!

**Core Concepts:**

* Static resources
* HTML describes the layout of page
* CSS makes it look good
* Natural templates / clickable HTML
	* Doesn't depend on Java yet
* This initial round is just to get the basics so that Doug can start setting up the backend. Proof of concept and not perfect.

## 2. Implement Search

**Done By:**

	Doug

**Demo:**

* Create classes to describe recipes (review properties / based off design)
	* [Ingredient.java](https://raw.githubusercontent.com/dhughes/tiy-developer-designer-crashcourse/master/implement_search/Ingredient.java)
	* [Instruction.java](https://raw.githubusercontent.com/dhughes/tiy-developer-designer-crashcourse/master/implement_search/Instruction.java)
	* [Recipe.java](https://raw.githubusercontent.com/dhughes/tiy-developer-designer-crashcourse/master/implement_search/Recipe.java)
* Use pre-created database
	* Add connection in IntelliJ to view data
		* recipes
	* Configure spring
		* [application.properties](https://raw.githubusercontent.com/dhughes/tiy-developer-designer-crashcourse/master/implement_search/application.properties)
* Create a data access object / repository
	* [RecipeRepository.java](https://raw.githubusercontent.com/dhughes/tiy-developer-designer-crashcourse/master/implement_search/RecipeRepository.java)
* Create class to "control" application
	* [RecipeController.java](https://raw.githubusercontent.com/dhughes/tiy-developer-designer-crashcourse/master/implement_search/RecipeController.java)
* Add Thymeleaf attributes to HTML to make it display our data.
	* [index.html](https://raw.githubusercontent.com/dhughes/tiy-developer-designer-crashcourse/master/implement_search/index.html) (updated)

**Core Concepts:**

* Java is an Object Oriented programming language
	* We create classes that describe objects.
	* Objects have descriptive properties and can perform actions via methods.
	* Classes are to blueprints as Objects are to houses.
	* The Recipe, Ingredient, and Instruction classes work together to describe a recipe
* Data in computers is ephemeral.
	* Stopping program erases memory
	* We want to persist
	* Files are one way to do this (like Save in Word)
* Databases store data on disk
	* Like spreadsheets
	* Made up of related tables
	* Tables are made up of columns and rows
	* Columns describe properties (like properties in a class)
	* Rows describe a given item (like a class)
* We need to tell Spring how to reach our database
	* Uses the JDBC and Postgres dependencies
* The RecipeRepository gets data from the database for me.
	* Using SQL
	* Translates it into our recipe (etc) objects
* Spring gives us a framework to handle web requests
	* RecipeController receives request from browser
	* Uses the RecipeRepository to get data
	* Passes it (via the model) to the HTML to be displayed
* Thymeleaf makes Lexi's templates dynamic.
	* HTML still functions as a natural template

## 3. Start Recipe HTML

**Done By:**

	Lexi

**Demo:**

* Fix home image object fit
* Create
	* recipe.html
* Update
	* index.html
	* style.css

**Core Concepts:**

* More natural templates (click from index to recipe)
* At this stage, fix any bugs on the search page such as skewed images and finish most of the styling.
* Move on the recipe detail page and again, at this point just trying to style enough so that is resembles my mockup and that Doug can start working.

## 4. Implement Recipe View

**Done By:**

	Doug

**Demo:**

* Update RecipeRepository.java
* Update RecipeController.java
* Update recipe.html for thymeleaf

**Core Concepts:**

* Methods are how we give object capabilities in Java
	* I want to be able to get a specific recipe
		* I add a method to the thing that gets recipes from the database
		* RecipeRepository
			* Added method to get a specific recipe
				* Added two support methods used by the first one
			* Changed how recipe list is sorted via SQL
	* I want my application to be able to show recipes
		* I add a method to the controller
		* Added a Spring annotation to make it work
			* It uses RecipeRepository to get data and passes it to Thymeleaf
* Thymeleaf is used to make static HTML be dynamic.
	* Natural templates

## 5. Make HTML Responsive

**Done By:**

	Lexi

**Demo:**

* Update css
	* styles.css

**Core Concepts:**

* At this stage, before I get too far into the javascript and behavior, work on the responsiveness.
* Add media queries and refactor some of my code to be more readable.
* Mention what mobile first design is (I didn't necessarily do that on this project but refactored my code to be that way)

## 6. Make Recipe Form and JS

**Done By:**

	Lexi

**Demo:**

* Add HTML to recipeForm.html
* Add adding elements in script.js
* Add CSS style updates in style.css

**Core Concepts:**

* More HTML and CSS for the recipe detail page
* Got the page set up and visually like I wanted it before worrying about interactivity. This is called a static prototype.
* At this point, add some javascript to make it interactive.
* Made it so that more input fields can be added.


## 7. Implement Save Recipe

**Done By:**

	Doug

**Demo:**

* Update RecipeController.java
* Update RecipeRepository.java
* Update recipeForm.html
* Update script.js

**Core Concepts:**

* Collaboration
	* Lexi and I both edited script.js
* HTTP
	* The protocol browsers use to send information across the internet
	* Get - Gets something from a server
	* Post - Sends form data to a server
* Looping
	* Code can do things repeatedly. 
	* In the RecipeRepository I use for loops to save each individual Ingredient and Instruction 
* Data is persisted in database

## Demo add Recipe

**Name:**

Easy Swedish Meatballs and Smashed Potatoes Recipe

**Description:**

A meat dish, originating in Europe, that uses meatballs combined with a sauce that is served as a main dish. Referred to as köttbullar in Sweden, Swedish meatballs is a food dish that uses beef, pork, veal, or a combination of several meats as the base for the meat ingredients.

**Servings:**

2

**Image URL:**

http://www.seriouseats.com/recipes/assets_c/2012/09/20120904SwedishMeatballs-thumb-625xauto-269513.jpg

**Ingredients:**

1 pound baby new potatoes
Kosher salt and freshly ground black pepper
14 ounces of sweet pork sausage, removed from its casing
1/4 cup breadcrumbs (preferably fresh)
1/4 cup milk, plus 6 tablespoons
1/2 teaspoon ground nutmeg or allspice (or a combination of the two), divided
1 pound baby new potatoes
Kosher salt and freshly ground black pepper
14 ounces of sweet pork sausage, removed from its casing
1/4 cup breadcrumbs (preferably fresh)
1/4 cup milk, plus 6 tablespoons
1/2 teaspoon ground nutmeg or allspice (or a combination of the two), divided
Lingonberry jam (optional)

**Instructions:**

Put the potatoes in a stockpot, and cover by an inch of water. Season with salt and boil until tender, about 10 minutes.

In a large bowl, gently mix together the sausage meat, breadcrumbs, 1/4 cup milk, 1/4 teaspoon of nutmeg or allspice, and 1/2 teaspoon pepper. Using wet hands or a scoop, divide mixture into 20 balls.

Heat olive oil in a large nonstick skillet over medium-high heat until shimmering. Add meatballs and brown on all sides, about 5 minutes total. Add broth, cover the pot, and simmer until the meatballs are cooked through, about 10 minutes. Add the remaining nutmeg or allspice and 2 tablespoons crème fraîche or sour cream. Stir to combine and simmer until sauce thickens lightly. Season to taste with salt and pepper.

Drain the potatoes, and return back to their hot pot. Add 6 tablespoons milk and 1/4 cup of crème fraîche or sour cream, and season with salt and pepper. Add half the parsley, if using, and smash the potatoes. Plate the potatoes, and pour the meatballs and sauce over the top. Top with the remaining parsley. Serve with lingonberry jam

## Deploy to production

**Done by:**

	Doug

**Demo:**

* Creating Heroku project
	* `heroku apps:create tiy-foodster-cc` 
* Git add remote for heroku
	* `git remote add heroku ...` 
* Backup database
	* `pg_dump recipes > recipes.sql`
* Create DB at Heroku
	* `heroku addons:create heroku-postgresql --app tiy-foodster-cc`
* Restore DB backup to Heroku
	* `heroku pg:psql --app tiy-deleteme < recipes.sql`
* Add
	* Procfile
	* application-heroku.properties
* Git add / commit
* `git push heroku master`

**Core Concepts:**

* Production environment
	* On the internet for the world
* Development
	* Private workspace
* Heroku is a convenient "cloud" hosting provider
	* Use git to push project up


## Take aways

- Lexi didn't need Java at all
- Doug didn't need skill at design
- Teamwork!
- We worked together to make sure to communicate any bugs as they happened. 
	- Because Lexi didn't have Java on her computer, things could look a little different when Doug implemented the actual data. 
	- The big key was that if something didn't look right or behaved strange, Doug pointed it out immediately and that took precedent. 
