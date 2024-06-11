final case class DP(value : Int):
  assert(value > 0)
  def +(another : DP) : DP = DP(value + another.value)
  def divideInto(parts : Int) : DP = DP(value / parts)
end DP
