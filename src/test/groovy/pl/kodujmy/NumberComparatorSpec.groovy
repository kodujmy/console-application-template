package pl.kodujmy

import spock.lang.*

class NumberComparatorSpec extends Specification {

  private NumberComparator numberComparator = new NumberComparator()

  
  def "minimum of #a and #b is #c"() {
    expect:
    numberComparator.min(a, b) == c

    where:
    a | b || c
    3 | 7 || 3
    5 | 4 || 4
    9 | 9 || 9
  }

}
