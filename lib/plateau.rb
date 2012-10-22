class Plateau
  attr_accessor :coords_bottom_left, :coords_top_right
  def initialize(b_left, t_right)
    @coords_bottom_left = b_left.split(',').map(&:to_i)
    @coords_top_right   = t_right.split(',').map(&:to_i)
  end
  def size
    [@coords_bottom_left, @coords_top_right]
  end
end