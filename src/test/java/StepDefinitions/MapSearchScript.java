package StepDefinitions;

import io.cucumber.java.en.*;

public class MapSearchScript {

	@Given("map selection page")
	public void map_selection_page() {
		System.out.println("Inside Step - user is on map selection page");
	}

	@And("user is on map search page")
	public void user_is_on_map_search_page() {
		System.out.println("Inside Step - user is able to choose on search page");
	}

	@When("user enters a existing map in search box")
	public void user_enters_a_existing_map_in_search_box() {
		System.out.println("Inside Step - user enter map name on search text box");
	}

	@And("hit the enter on Go button")
	public void hit_the_enter_on_go_button() {
		System.out.println("Inside Step - user is click on Go button");
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("Inside Step - user is on selected map page");
	}
}
