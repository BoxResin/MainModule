fun max3(a: Int, b: Int, c: Int)
{
	return Math.max(a, Math.max(b, c))
}

fun min3(a: Int, b: Int, c: Int)
{
	return Math.min(a, Math.min(b, c))
}

fun maxN(varargs nums: Int)
{
	return nums.max()
}

fun minN(varargs nums: Int)
{
	return nums.min()
}
