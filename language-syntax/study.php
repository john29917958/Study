<?php

function printVarInfo($var) {
    $html = "<p>
        Value of \$var is: $var<br>" .
        "Type of \$var is: " . gettype($var) .
    "</p>";

    return $html;
}

echo "=========== Primitive Types ===========\n";

echo "Type: integer\n";
$var = 10;
$type = gettype($var);
echo "value of \$var is: $var\n";
echo "type of \$var is: $type\n";
echo "\n";

echo "Type: string\n";
$var = "Hello, world!";
$type = gettype($var);
echo "value of \$var is: $var\n";
echo "length of \$var is: " . strlen($var) . "\n";
echo "type of \$var is: $type\n";
echo "\n";

$var = "Hello!
world!";
echo "value of multi-line string is: $var\n";
echo "\n";

echo "Type: float\n";
$var = 0.1;
$type = gettype($var);
echo "value of \$var is: $var\n";
echo "type of \$var is: $type\n";
echo "\n";

echo "Type: array\n";
$var = array(1, 2, 3, 4, 5, "arrElem" => "Hello, world!");
$type = gettype($var);
echo "value of \$var[0] is: $var[0]\n";
echo "value of \$var[\"arrElem\"] is: " . $var["arrElem"] . "\n";
echo "type of \$var is: $type\n";
echo "size of \$var is: " . count($var) . "\n";
unset($var["arrElem"]);
echo "value of \$var after unset is: \n";
print_r($var);
$var["arrElem"] = "Hello, world!";
echo "value of \$var after setting an element is: \n";
print_r($var);
array_splice($var, 3, 1, array(100));
echo "value of \$var after setting replacing element at index 3 is: \n";
print_r($var);
echo "\n";

/* Supported in PHP 8
echo "Type: enum";
enum Colors
{
    case Red;
    case Green;
    case Blue;
}
echo "1st. Colors value is: " . Colors::Red;
$var = Colors::Red;
echo "Are $var and Color::Red the same? " . ($var == Colors::Red);
echo "Are $var and Color::Green the same? " . ($var == Colors::Green);
echo "\n";
*/



?>