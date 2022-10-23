local function fizzBuzz(n)
    local output = ""

    if (n % 3 == 0) then output = output.."Fizz" end
    if (n % 5 == 0) then output = output.."Buzz" end

    if (output == "") then output = n end
    return output
end

for i = 1, 100, 1 do
    print(fizzBuzz(i))
end
