class Direction
  attr_accessor :enum,:degree
  def initialize(str)
    @enum = str
    @degree = 0
  end
  def set(att)
    if att.class == String
      @enum, @degree = att, to_degree(att)
    else
      @degree, @enum  = att, to_enum(att)
    end
    nil
  end
  def to_degree(str = @enum)
    case str
      when 'N' then 0
      when 'S' then 180
      when 'E' then 90
      when 'W' then 270
      else self
    end
  end
  def to_enum(int = @degree)
    case int.to_i
      when 0 then 'N'
      when 180 then 'S'
      when 90 then 'E'
      when 270 then 'W'
      else self
    end
  end
  def ==(str)
    if str.class == String
      enum == str
    else
      degree == str.to_i
    end
  end
end