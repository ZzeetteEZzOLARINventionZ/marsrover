class Rover
  attr_accessor :navigator, :visual
  def initialize(str)
    str = str.split
    @navigator = Navigator.new(str[0].to_i, str[1].to_i, str[2])
  end
  def inspect
    {:x => @navigator.pos_x, :y => @navigator.pos_y, :d => @navigator.direction.to_enum}
  end
  def command(string)
    string.split(//).each do |c|
      case c
        when /(L|R)/
          @navigator.rotate(c)
          puts "Rotate #{c} direction: #{@navigator.direction.to_enum}" if @visual
        when 'M'
          old_x, old_y = @navigator.pos_x, @navigator.pos_y
          @navigator.move
          puts "Step forward from (#{old_x},#{old_y}) to (#{@navigator.pos_x}, #{@navigator.pos_y})" if @visual
      end
    end
  end
end