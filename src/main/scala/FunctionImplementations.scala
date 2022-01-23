class FunctionImplementations {
  def squareList(xs: List[Int]): List[Int] =
    xs match {
      case List() => xs
      case y :: ys => y * y :: squareList(ys)
    }

  def squareListUsingMap(xs: List[Int]): List[Int] = {
    xs map(x => x * x)
  }
}