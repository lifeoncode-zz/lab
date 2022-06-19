import unittest
import app


class TestApp(unittest.TestCase):

    def test_add(self):
        self.assertEqual(4, app.add(2, 2))
        self.assertEqual(15, app.add(10, 5))
        self.assertEqual(2, app.add(-22, 24))
        self.assertEqual(105, app.add(-105, 210))


    

if __name__ == "__main__":
    unittest.main()