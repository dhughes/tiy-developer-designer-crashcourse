# Developer Designer Workflow

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
	* Add Lexi as collaborator
* Create a Spring project in IntelliJ
	* Web
	* Thymeleaf
	* JDBC
	* Postgres
	* Devtools
* Push to Github

**Core Concepts:**

* Git is a source code control system
	* Stores versions of files as we work through project
* Github is a collaboration tool
	* Share repositories with others.
* IntelliJ is a tool to edit Java source code.
	* Source code are the files that make up a programming project.
	* Projects are collections of related files.
* Spring is a tool used to organize and simplify my code.
* Pushing in Git is how I share with Lexi

## 1. Initial Search HTML

**Done By:**

	Lexi

**Demo:**

* Clone from Github
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

* Classes are used to describe objects and perform actions.
* Databases store data
	* Tables
* SQL is a language used to retrieve data from the database.
* Controller receives requests from browsers
	* Gets data from DB using repository
		* Data translated to list of recipes
	* Recipe data is passed to HTML
* Thymeleaf renders HTML
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

* Updating recipe.html with thymeleaf
* Update RecipeRepository.java
	* Changed sorting
	* Requiring updates to entities
		* Recipe.java
		* Ingredient.java
		* Instruction.java
* Update RecipeController.java
	* Gets data from repo
	* shows via th attrs

**Core Concepts:**

* ????

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

* Update html
	* recipe.html
	* recipeForm.html
* Update script.js
* Update RecipeController.java
* Update RecipeRepository.java
* Update entities
	* Ingredient.java
	* Instruction.java
	* Recipe.java


## Take aways

- Lexi didn't need Java at all
- Doug didn't need skill at design
- Teamwork!
- We worked together to make sure to communicate any bugs as they happened. Because Lexi didn't have Java on her computer, things could look a little different when Doug implemented the actual data. The big key was that if something didn't look right or behaved strange, Doug pointed it out immediately and that took precedent. 
