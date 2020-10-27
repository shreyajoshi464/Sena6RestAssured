package GotDefinitions;


import io.cucumber.junit.CucumberOptions;

//RUnWith(Cucumber.class)
@CucumberOptions(features="src//test//resources//Features" , glue={"GotDefinitions"})
public class Bat extends Nat {

}
