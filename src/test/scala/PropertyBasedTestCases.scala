import testing_practice.PropertyBasedTesting.{add, multiplication}
import org.scalacheck.Prop.forAll
class PropertyBasedTestCases extends munit.ScalaCheckSuite {
  property("Addition"){
    forAll{(n1:Int,n2:Int)=>{
      add(n1,n2)==add(n2,n1)
    }
    }
  }
  property("Addition"){
    forAll{(n1:Int,n2:Int)=>{
      multiplication(n1,n2)==multiplication(n2,n1)
    }
    }
  }
}
