

def find_num(nums, target):
    found_num_index = []
    for num in range(len(nums)):
        if nums[num] == target:
            found_num_index.append(num)

    return found_num_index

nums = [1, 2, 4, 6, 4, 2, 5, 4]

print(find_num(nums, 4))