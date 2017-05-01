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

* ????

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

* Sketch is a design tool used for ...???
* Mockups / designs help you understand ...???

## Project setup

**Done by:** 

	Doug

**Demo:**

* Create a Github repo
	* Add Lexi as collaborator
* Create a Spring project in IntelliJ
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

* Create templates and static folders
* Create HTML and CSS files for Search

**Code:**

* [index.html](https://raw.githubusercontent.com/dhughes/tiy-developer-designer-crashcourse/master/initial_html/index.html)
* [style.css](https://raw.githubusercontent.com/dhughes/tiy-developer-designer-crashcourse/master/initial_html/style.css)

**Core Concepts:**

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
* ?????

