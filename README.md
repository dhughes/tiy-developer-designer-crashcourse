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
* Disposable
* Something, something, design....
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

## Initial Search HTML

**Done By:**

	Lexi

**Demo:**

* Clone from Github
* Create templates and static folders
* Create CSS and JS folders
* Create empty files for 
	* index.html 
	* recipe.html
	* recipeForm.html
*  CSS files for Search
	* style.css

**Core Concepts:**

* Static resources
* HTML describes the layout of page
* CSS makes it look good
* Natural templates / clickable HTML
	* Doesn't depend on Java yet

## Implement Search

**Done By:**

	Doug

**Demo:**

* Create classes to describe recipes (review properties / based off design)
	* Recipe
	* Ingredient
	* Instruction
* Create a database
	* Add connection in IntelliJ to view data
* Create a data access object / repository
* Create class to "control" application
	* RecipeController
* Add Thymeleaf attributes to HTML to make it display our data.

**Code:**

* [Ingredient.java](https://raw.githubusercontent.com/dhughes/tiy-developer-designer-crashcourse/master/implement_search/Ingredient.java)
* [Instruction.java](https://raw.githubusercontent.com/dhughes/tiy-developer-designer-crashcourse/master/implement_search/Instruction.java)
* [Recipe.java](https://raw.githubusercontent.com/dhughes/tiy-developer-designer-crashcourse/master/implement_search/Recipe.java)
* SQL <------ @todo
* [RecipeRepository.java](https://raw.githubusercontent.com/dhughes/tiy-developer-designer-crashcourse/master/implement_search/RecipeRepository.java)
* [application.properties](https://raw.githubusercontent.com/dhughes/tiy-developer-designer-crashcourse/master/implement_search/application.properties)
* [RecipeController.java](https://raw.githubusercontent.com/dhughes/tiy-developer-designer-crashcourse/master/implement_search/RecipeController.java)
* [index.html](https://raw.githubusercontent.com/dhughes/tiy-developer-designer-crashcourse/master/implement_search/index.html) (updated)

**Core Concepts:**

* Classes are used to describe objects and perform actions.
* Databases store data
* SQL is a language used to retrieve data from the database.
* Controller receives requests from browsers
	* Gets data from DB using repository
		* Data translated to list of recipes
	* Recipe data is passed to HTML
* Thymeleaf renders HTML
	* HTML still functions as a natural template

## Update Search HTML and CSS

**Done By:**

	Lexi

**Demo:**

* Apply CSS changes
* Apply HTML changes

**Code:**

* [style.css](https://raw.githubusercontent.com/dhughes/tiy-developer-designer-crashcourse/master/update_search_html_css/style.css)
* [index.html](https://raw.githubusercontent.com/dhughes/tiy-developer-designer-crashcourse/master/update_search_html_css/index.html)

**Core Concepts:**

* CSS used for styling
* Development is an iterative process
* First step is just to get something on the page so that Doug and the backend developers can work. After, you can start refining.
* Add media queries for responsiveness. 

## Start Recipe HTML 

**Done By:**

	Lexi

**Demo:**

* Create recipe html
* Update CSS

**Code:**

* recipe.html

**Core Concepts:**

* More natural templates (click from index to recipe)

## Implement Recipe View

Done By:

	Doug

Demo:

* ????

Code:

* ????

Core Concepts:

* ????

## Refine Recipe HTML and CSS


## Start Add Recipe Form

Doug makes it ugly

## Make Recipe form not hideous

Lexi does CSS and JS

## Implement Save Recipe

Doug update JS / connects to DB

## Take aways

Lexi didn't need Java at all
Doug didn't need skill at design
Teamwork!
